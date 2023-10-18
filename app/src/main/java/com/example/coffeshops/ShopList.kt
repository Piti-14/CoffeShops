package com.example.coffeshops

import android.content.res.Resources
import android.content.res.XmlResourceParser
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


@Composable
fun AppInit() {

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {CreateCoffeCards()}
    }
}

@Composable
fun CreateCoffeCards() {
    /* for (shop in coffeshops) {
         sacar datos de shop (nombre, direccion, imagen, comentarios)
         crear Card que contenga y estructure esos datos,
         añadir card a una lista de Cards para que el lazycolumn las coloque como items
       } */
    Card(
        modifier = Modifier
        .fillMaxSize()
        .padding(15.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.images), contentDescription = "Greco")

        Text("Cafetería Nekkoffe")
    }
}
@Composable
fun readAllCafeterias(resources: Resources): List<CoffeShop> {
    val coffeShops = mutableListOf<CoffeShop>()

    val resourceId = resources.getIdentifier("coffeshops", "xml", "res.xml")

    if (resourceId == 0) {
        // El recurso XML no se encontró, maneja el error apropiadamente
        return coffeShops
    }

    val parser: XmlResourceParser = resources.getXml(resourceId)

    // Asegúrate de incluir el código para procesar el archivo XML y crear objetos CoffeShop.

    return coffeShops
}
