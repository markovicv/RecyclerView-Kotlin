package com.example.ktrecyclerview.db

import com.example.ktrecyclerview.model.Post

class Data {

    companion object{
        fun getData() :ArrayList<Post>{
            val listOfPosts = ArrayList<Post>()

            listOfPosts.add(Post("C++","One of the fastest programing languages",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRXrBcras0tZSfy6XS84St5Z7MusSdcB0vum1gIc3j414iIC0hq",
                "Vule"

                ))

            listOfPosts.add(
                Post("Russia","Biggest country in the world, and also very cold",
                "https://lh3.googleusercontent.com/proxy/CGo2N4CrttDU_Wce2HeSZCf5KDnXhcPKD50SnS4dv1lKFZOkHD6YLEiPYBib_TfMj3KA23UuXX1nQ3joX4SedeQ12_U_zDeQJcBzMINqvhqdzxdIRWygp6eh8kGZJauTprD4bY-thHk",
                    "Vladimir")
            )

            listOfPosts.add(Post("Health","healthy eating and lifting weights will make you feel better",
                "https://staticylai.state.gov/uploads/sites/2/2018/04/a-change-in-lifestyle-1430599_960_720-720x520.jpg",
                "Rick"
                ))
            listOfPosts.add(Post("C++","One of the fastest programing languages",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRXrBcras0tZSfy6XS84St5Z7MusSdcB0vum1gIc3j414iIC0hq",
                "Vule"

            ))
            listOfPosts.add(
                Post("Russia","Biggest country in the world, and also very cold",
                    "https://lh3.googleusercontent.com/proxy/CGo2N4CrttDU_Wce2HeSZCf5KDnXhcPKD50SnS4dv1lKFZOkHD6YLEiPYBib_TfMj3KA23UuXX1nQ3joX4SedeQ12_U_zDeQJcBzMINqvhqdzxdIRWygp6eh8kGZJauTprD4bY-thHk",
                    "Vladimir")
            )
            listOfPosts.add(Post("Health","healthy eating and lifting weights will make you feel better",
                "https://staticylai.state.gov/uploads/sites/2/2018/04/a-change-in-lifestyle-1430599_960_720-720x520.jpg",
                "Rick"
            ))





            return listOfPosts
        }




    }
}