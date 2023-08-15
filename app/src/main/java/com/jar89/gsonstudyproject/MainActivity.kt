package com.jar89.gsonstudyproject

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.Gson
import com.jar89.gsonstudyproject.adapter.UsersAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPref: SharedPreferences
    private lateinit var usersRv: RecyclerView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button

    private val usersAdapter = UsersAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPref = getSharedPreferences("all_users", MODE_PRIVATE)
        //write(sharedPref, race1)
        val usersArray = readNew(sharedPref)

        usersRv = findViewById(R.id.usersRv)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        usersRv.adapter = usersAdapter
        usersAdapter.users = usersArray



        btn1.setOnClickListener {
            writeRaces(sharedPref, allRaces)
            val allRc = readRaces(sharedPref)
            usersAdapter.users = allRc[0].users
            usersAdapter.notifyDataSetChanged()
        }
        btn2.setOnClickListener {
            writeRaces(sharedPref, allRaces)
            val allRc = readRaces(sharedPref)
            usersAdapter.users = allRc[1].users
            usersAdapter.notifyDataSetChanged()
        }
        btn3.setOnClickListener {
            writeRaces(sharedPref, allRaces)
            val allRc = readRaces(sharedPref)
            usersAdapter.users = allRc[2].users
            usersAdapter.notifyDataSetChanged()
        }
    }

    // чтение
    fun read(sharedPreferences: SharedPreferences): Array<User> {
        val json = sharedPreferences.getString("users", null) ?: return emptyArray()
        return Gson().fromJson(json, Array<User>::class.java)
    }

    fun readNew(sharedPreferences: SharedPreferences): List<User> {
        val json = sharedPreferences.getString("users", null) ?: return listOf()
        return Gson().fromJson(json, Array<User>::class.java).toMutableList()
    }

    fun readRaces(sharedPreferences: SharedPreferences): List<Race> {
        val json = sharedPreferences.getString("races", null) ?: return listOf()
        return Gson().fromJson(json, Array<Race>::class.java).toMutableList()
    }

    fun write(sharedPreferences: SharedPreferences, user: Array<User>) {
        val json = Gson().toJson(user)
        sharedPreferences.edit()
            .putString("users", json)
            .apply()
    }

    fun writeRaces(sharedPreferences: SharedPreferences, races: List<Race>) {
        val json = Gson().toJson(races)
        sharedPreferences.edit()
            .putString("races", json)
            .apply()
    }
}