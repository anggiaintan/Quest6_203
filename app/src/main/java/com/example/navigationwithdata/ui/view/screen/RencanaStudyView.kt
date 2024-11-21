package com.example.navigationwithdata.ui.view.screen

import androidx.compose.runtime.Composable
import com.example.navigationwithdata.model.Mahasiswa

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
){
var chosenDropDown by remember {
    mutableStateOf("")
}
    var checked by remember {mutableStateOf(false)}
    var pilihanKelas by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(chosenDropDown, pilihanKelas)

}