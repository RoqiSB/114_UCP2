package com.example.ucp2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    pilihandosen:List<String>,
    onSelectionChanged: (String) ->Unit,
){
    var namaTxt by remember {
        mutableStateOf("")
    }
    var nimTxt by remember {
        mutableStateOf("")
    }
    var konsulTxt by remember {
        mutableStateOf("")
    }
    var judulTxt by remember {
        mutableStateOf("")
    }
    var listData:MutableList<String> = mutableListOf(namaTxt,nimTxt,konsulTxt,judulTxt)
    var dosen1 by rememberSaveable { mutableStateOf("") }
    var dosen2 by rememberSaveable { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        OutlinedTextField(
            value = namaTxt,
            onValueChange ={namaTxt = it},
            label = { Text(text = stringResource(id = R.string.nama))})
        OutlinedTextField(
            value = nimTxt,
            onValueChange ={nimTxt = it},
            label = { Text(text = stringResource(id = R.string.nim))})
        OutlinedTextField(
            value = konsulTxt,
            onValueChange ={konsulTxt = it},
            label = { Text(text = stringResource(id = R.string.konsultasi))})
        OutlinedTextField(
            value = judulTxt,
            onValueChange ={judulTxt = it},
            label = { Text(text = stringResource(id = R.string.judul))})
    }
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier =
            Modifier.padding(16.dp)
        ) {
            pilihandosen.forEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = dosen1 == item,
                    onClick = {
                        dosen1 = item
                        onSelectionChanged(item)
                    }
                ),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = dosen1 == item,
                        onClick = {
                            dosen1 = item
                            onSelectionChanged(item)
                        }
                    )
                    Text(item)
                }
            }
        }
    }
}