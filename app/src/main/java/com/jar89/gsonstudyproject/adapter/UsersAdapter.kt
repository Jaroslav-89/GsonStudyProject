package com.jar89.gsonstudyproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jar89.gsonstudyproject.R
import com.jar89.gsonstudyproject.User
import java.text.SimpleDateFormat
import java.util.*

class UsersAdapter: RecyclerView.Adapter<UsersViewHolder>() {

        var users = listOf<User>()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.user_item, parent, false)
            return UsersViewHolder(view)
        }

        override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
            holder.bind(users[position])
        }

        override fun getItemCount() = users.size
    }

    class UsersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name: TextView = itemView.findViewById(R.id.name)
        private val number: TextView = itemView.findViewById(R.id.number)
        private val laps: TextView = itemView.findViewById(R.id.laps)

        fun bind(user: User) {
            name.text = user.name
            number.text = user.number.toString()
            var lapsTime: String = ""
                for(i in 0 until user.allLaps.size) {

                lapsTime += "Круг ${i+1}: ${user.allLaps[i].toString()}\n"
            }
            laps.text = lapsTime
            }
        }

