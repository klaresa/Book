package com.example.claricesantos.bookerama

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.example.claricesantos.bookerama.database.allBooks
import kotlinx.android.synthetic.main.fragment_book_list.*

class MainActivity : AppCompatActivity() {

    val books = allBooks

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // configurando a RecyclerView
        bookList_recyclerView.adapter = BookAdapter(books)

        // da forma a RecyclerView
        bookList_recyclerView.layoutManager = LinearLayoutManager(this)

        bookList_recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
}
