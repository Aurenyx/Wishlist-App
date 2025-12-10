package com.mrgogu.wishlist_app


import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun AppBarView(
    title : String,
    onBackNavClicked :()-> Unit ={}
){
    val navigationIcon :(@Composable () -> Unit)? =
        if(!title.contains("WishList")){
    {
        IconButton(onClick = { onBackNavClicked() }) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                tint = Color(0xFFFFE3BB),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
        }
    }
    }else null

    TopAppBar(
        title = {
            Text(
                text = title, color = colorResource(id = R.color.App_Title_Color), fontSize = 30.sp, fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 4.dp).heightIn(max = 30.5.dp))
         },
                elevation = 3.dp,
                backgroundColor = colorResource(id=R.color.App_Bar_Color),
                navigationIcon = navigationIcon
        )
}