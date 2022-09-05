package database

import jdk.jshell.spi.ExecutionControl.StoppedException
import model.UserData

class UserDatabaseImpl : UserDatabase {

    private val userList = mutableListOf(
        UserData(1, "randy", "randyan", "anugerah", "malang"),
        UserData(2, "anna", "annacha", "chaimaira", "banjar"),
        UserData(3, "alfin", "alfinyus", "yusriansyah", "banyuwangi")
    )

    override fun findAllUser(): List<UserData> = userList

    override fun findUser(username: String): UserData? {

//        for solution
//        for (position in 0 .. userList.size){
//            val selectedUser = userList[position]
//            if(selectedUser.username.equals(username, true)){
//                return selectedUser
//            }
//        }
//        return null
//        =========================================================================================
//        // it solution
//        userList.forEach {
//            if (it.username.equals(username, true)) {
//                return it
//            }
//        }
//        return null

//        =========================================================================================
//        lambda solution
//        userList.forEach ({ selectedUser ->
//            if (selectedUser.username.equals(username, true)) {
//                return selectedUser
//            }
//        })
//        return null
//        }

//        =========================================================================================
//        trailing lambda
//        userList.forEach { selectedUser ->
//            if (selectedUser.username.equals(username, true)) {
//                return selectedUser
//            }
//        }
//        return null

//        =========================================================================================
//        find() solutions
        return userList.find {
            it.username.equals(username, true)
        }
    }

    override fun addUser(data: UserData) {
        userList.add(data)
    }
}