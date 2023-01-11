package com.example.homework18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfPictures = listOf(
            "https://rare-gallery.com/uploads/posts/1113891-landscape-forest-nature-reflection-bridge-river-stream-walkway-tree-autumn-leaf-season-watercourse-woodland-habitat-natural-environment-waterway.jpg",
            "https://catherineasquithgallery.com/uploads/posts/2021-03/1614784533_1-p-skazochnie-foni-dlya-fotoshopa-2.jpg",
            "https://i.pinimg.com/originals/b1/02/dc/b102dcda56577ee8b860b89dadf0f4c0.jpg",
            "https://cdn.fishki.net/upload/post/201404/14/1260695/1_lfsxuww.jpg",
            "https://phonoteka.org/uploads/posts/2021-03/1616710281_53-p-fon-dlya-rabochego-stola-uspokaivayushchii-55.jpg",
            "https://get.pxhere.com/photo/man-person-girl-woman-camera-photography-dslr-portrait-spring-red-lens-color-autumn-canon-romance-season-taking-photo-photograph-beauty-emotion-photo-shoot-portrait-photography-939435.jpg",
            "https://s7.hostingkartinok.com/uploads/images/2015/01/8ab79903b8acfac2062d21d72b85e36f.jpg",
            "https://cdn.fishki.net/upload/post/2018/06/04/2615820/11.jpg",
            "https://miro.medium.com/max/1200/1*A1nFvVPnIi1XlCnBZBr28Q.jpeg",
            "https://yt3.ggpht.com/ytc/AMLnZu8gKblARYHCQWkkZU74Y5qKYumZVVAz0cWUve1d=s900-c-k-c0x00ffffff-no-rj"
        )
        var counter = 0
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            if(counter < 10){
            Glide
                .with(this)
                .load(listOfPictures[counter])
                .into(findViewById(R.id.picture))
            counter++
            } else {
                counter = 0
                Glide
                    .with(this)
                    .load(listOfPictures[counter])
                    .into(findViewById(R.id.picture))
                counter++
            }
        }
    }
}

