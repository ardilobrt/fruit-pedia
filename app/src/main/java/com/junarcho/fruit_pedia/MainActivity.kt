package com.junarcho.fruit_pedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.junarcho.buah_pedia.R
import com.junarcho.fruit_pedia.adapter.CardFruitAdapter
import com.junarcho.fruit_pedia.adapter.GridFruitAdapter
import com.junarcho.fruit_pedia.adapter.ListFruitAdapter
import com.junarcho.fruit_pedia.entity.Fruits
import com.junarcho.fruit_pedia.entity.FruitsData
class MainActivity : AppCompatActivity() {

    private lateinit var rvFruits: RecyclerView
    private var list: ArrayList<Fruits> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        rvFruits = findViewById(R.id.rv_fruits)
        rvFruits.setHasFixedSize(true)

        list.addAll(FruitsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.manu_main, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_grid -> {
                showRecyclerGrid()
            }
            R.id.action_cardview -> {
                showCardView()
            }
            R.id.about -> {

                // Go to About Dev Activity
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }
    }

    private fun showRecyclerList() {
        rvFruits.layoutManager = LinearLayoutManager(this)
        val listFruitAdapter = ListFruitAdapter(list)
        rvFruits.adapter = listFruitAdapter

        listFruitAdapter.setOnItemClickCallback(object : ListFruitAdapter.OnItemClickCallback {

            override fun onItemClicked(data: Fruits) {

                //Call callToast & callIntent function
                callToast(data)
                callIntent(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvFruits.layoutManager = GridLayoutManager(this, 2)
        val gridFruitAdapter = GridFruitAdapter(list)
        rvFruits.adapter = gridFruitAdapter

        gridFruitAdapter.setOnItemClickCallback(object : GridFruitAdapter.OnItemClickCallback {

            //Call callToast & callIntent function
            override fun onItemClicked(data: Fruits) {
                callIntent(data)
                callToast(data)
            }
        })
    }

    private fun showCardView() {
        rvFruits.layoutManager = LinearLayoutManager(this)
        val cardFruitAdapter = CardFruitAdapter(list)
        rvFruits.adapter = cardFruitAdapter
    }

    private fun callToast(fruits: Fruits) {

        // Make a toast from fruit's name selected
        val fruitName = fruits.name
        Toast.makeText(this, "You Choose $fruitName", Toast.LENGTH_SHORT).show()
    }

    private fun callIntent(data: Fruits){

        // Set an intent from fruit's name selected
        val detailActivityIntent =
            Intent(this@MainActivity, DetailActivity::class.java).apply {
                putExtra(DetailActivity.EXTRA_IMAGE, data.photo)
                putExtra(DetailActivity.EXTRA_NAME, data.name)
                putExtra(DetailActivity.EXTRA_ENGLISH, data.englishName)
                putExtra(DetailActivity.EXTRA_DETAIL, data.details)
                putExtra(DetailActivity.EXTRA_BENEFIT, data.benefits)
            }

        startActivity(detailActivityIntent)
    }
}

