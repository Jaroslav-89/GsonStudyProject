package com.jar89.gsonstudyproject
data class User(
    val name: String,
    val number: Int,
    val allLaps: List<Long>
)

val race1 = Race (arrayListOf(
    User("P1 A",1, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 A",2, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 A",3, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 A",4, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 A",5, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 AF",6, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 AG",7, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 AM",8, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 AP",9, listOf<Long>(1234,12345,123456,1234567)),
    User("P1 AK",10, listOf<Long>(1234,12345,123456,1234567))
))

val race2 = Race (arrayListOf(
    User("P2 A",1, listOf<Long>(1234,12345,123456,1234567)),
    User("P2B",2, listOf<Long>(1234,12345,123456,1234567)),
    User("P2C",3, listOf<Long>(1234,12345,123456,1234567)),
    User("P2D",4, listOf<Long>(1234,12345,123456,1234567)),
    User("P2E",5, listOf<Long>(1234,12345,123456,1234567)),
    User("P2F",6, listOf<Long>(1234,12345,123456,1234567)),
    User("P2G",7, listOf<Long>(1234,12345,123456,1234567)),
    User("P2M",8, listOf<Long>(1234,12345,123456,1234567)),
    User("vP",9, listOf<Long>(1234,12345,123456,1234567)),
    User("P2K",10, listOf<Long>(1234,12345,123456,1234567))
))

val race3 = Race (arrayListOf(
    User("P3 A",1, listOf<Long>(1234,12345,123456,1234567)),
    User("P3B",2, listOf<Long>(1234,12345,123456,1234567)),
    User("P3C",3, listOf<Long>(1234,12345,123456,1234567)),
    User("P3D",4, listOf<Long>(1234,12345,123456,1234567)),
    User("P3E",5, listOf<Long>(1234,12345,123456,1234567)),
    User("P3F",6, listOf<Long>(1234,12345,123456,1234567)),
    User("P3P3G",7, listOf<Long>(1234,12345,123456,1234567)),
    User("P3M",8, listOf<Long>(1234,12345,123456,1234567)),
    User("P3P",9, listOf<Long>(1234,12345,123456,1234567)),
    User("P3K",10, listOf<Long>(1234,12345,123456,1234567))
))
val race4 = Race (arrayListOf(
    User("P4 A",1, listOf<Long>(1234,12345,123456,1234567)),
    User("B",2, listOf<Long>(1234,12345,123456,1234567)),
    User("C",3, listOf<Long>(1234,12345,123456,1234567)),
    User("D",4, listOf<Long>(1234,12345,123456,1234567)),
    User("E",5, listOf<Long>(1234,12345,123456,1234567)),
    User("F",6, listOf<Long>(1234,12345,123456,1234567)),
    User("G",7, listOf<Long>(1234,12345,123456,1234567)),
    User("M",8, listOf<Long>(1234,12345,123456,1234567)),
    User("P",9, listOf<Long>(1234,12345,123456,1234567)),
    User("K",10, listOf<Long>(1234,12345,123456,1234567))
))
val race5 = Race (arrayListOf(
    User("P5 A",1, listOf<Long>(1234,12345,123456,1234567)),
    User("B",2, listOf<Long>(1234,12345,123456,1234567)),
    User("C",3, listOf<Long>(1234,12345,123456,1234567)),
    User("D",4, listOf<Long>(1234,12345,123456,1234567)),
    User("E",5, listOf<Long>(1234,12345,123456,1234567)),
    User("F",6, listOf<Long>(1234,12345,123456,1234567)),
    User("G",7, listOf<Long>(1234,12345,123456,1234567)),
    User("M",8, listOf<Long>(1234,12345,123456,1234567)),
    User("P",9, listOf<Long>(1234,12345,123456,1234567)),
    User("K",10, listOf<Long>(1234,12345,123456,1234567))
))

val allRaces = listOf(race1, race2, race3, race4, race5)
