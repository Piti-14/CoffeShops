package com.example.coffeshops

import android.content.res.XmlResourceParser
import android.util.Xml
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.coffeshops.ui.theme.CoffeShop
import org.xml.sax.helpers.XMLReaderAdapter


@Composable
fun AppInit() {



    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {CreateCoffeCards()}
    }
}

@Composable
fun CreateCoffeCards() {

    Card(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp)) {
        Image(painter = painterResource(id = R.drawable.images), contentDescription = "")

        Text("Cafetería Nekkoffe")
    }
}
@Composable
fun getCoffeShops(): ArrayList<CoffeShop>{
    val shops = ArrayList<CoffeShop>()
    var comments = ArrayList<String>()

    //val parser: XmlResourceParser
    CoffeShop("Antico Caffe Greco", "St. Italy, Rome", R.drawable.images, comments)

    return shops
}