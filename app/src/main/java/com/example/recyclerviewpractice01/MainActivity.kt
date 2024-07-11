package com.example.recyclerviewpractice01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewpractice01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val personInformationList = ArrayList<Pair<String, String>>()
        personInformationList.add(Pair(first = "Shajib", second = "Dhaka"))
        personInformationList.add(Pair(first = "Hasan", second = "Jessore"))
        personInformationList.add(Pair(first = "Labiba", second = "Khulna"))
        personInformationList.add(Pair(first = "Rahim", second = "Pirgonj"))
        personInformationList.add(Pair(first = "Kamrul", second = "Rangpur"))
        personInformationList.add(Pair(first = "Shajib", second = "Dhaka"))
        personInformationList.add(Pair(first = "Hasan", second = "Jessore"))
        personInformationList.add(Pair(first = "Labiba", second = "Khulna"))
        personInformationList.add(Pair(first = "Rahim", second = "Pirgonj"))
        personInformationList.add(Pair(first = "Kamrul", second = "Rangpur"))
        personInformationList.add(Pair(first = "Shajib", second = "Dhaka"))
        personInformationList.add(Pair(first = "Hasan", second = "Jessore"))
        personInformationList.add(Pair(first = "Labiba", second = "Khulna"))
        personInformationList.add(Pair(first = "Rahim", second = "Pirgonj"))
        personInformationList.add(Pair(first = "Kamrul", second = "Rangpur"))
        personInformationList.add(Pair(first = "Shajib", second = "Dhaka"))

        val personInformationAdapter = PersonInformationAdapter(
            personInformation = personInformationList
        )

        /*binding.recyclerview.adapter = personInformationAdapter
        binding.recyclerview.setHasFixedSize(true)*/

        binding.recyclerview.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = personInformationAdapter
            setHasFixedSize(true)
        }
    }
}