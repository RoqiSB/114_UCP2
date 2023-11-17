package com.example.ucp2.ui.komponen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.ucp2.R

@Composable
fun FormatData(
    nm:String,
    nim:String,
    konsul:String,
    judul:String
){
    Text(
        text = stringResource(R.string.nama),
    )
    Text(nm)
    Divider()
    Spacer(modifier = Modifier.padding(8.dp))


    Text(
        text = stringResource(R.string.nim),
    )
    Text(nim)
    Divider()
    Spacer(modifier = Modifier.padding(10.dp))


    Text(
        text = stringResource(R.string.konsultasi),
    )
    Text(konsul)
    Divider()
    Text(
        text = stringResource(R.string.judul),
    )
    Text(judul)
    Divider()
}