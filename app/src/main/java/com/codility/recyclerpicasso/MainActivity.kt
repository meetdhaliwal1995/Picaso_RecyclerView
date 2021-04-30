package com.codility.recyclerpicasso

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getUserList()
    }

    private fun getUserList() {
        recyclerView.visibility = View.VISIBLE
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val versions = ArrayList<Version>()

        versions.addAll(Version.getAndroidVersionList())

        val myAdapter = MyAdapter(versions)
        recyclerView.adapter = myAdapter
    }
}