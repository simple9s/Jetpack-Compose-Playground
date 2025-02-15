package com.steleot.jetpackcompose.playground.compose.materialicons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steleot.jetpackcompose.playground.navigation.graph.MaterialIconsNavRoutes
import com.steleot.jetpackcompose.playground.ui.base.material.DefaultScaffold

private const val URL = "materialicons/OutlinedScreen.kt"

@Composable
fun OutlinedScreen() {
    DefaultScaffold(
        title = MaterialIconsNavRoutes.Outlined,
        link = URL,
    ) {
        OutlinedGrid(paddingValues = it)
    }
}

private val list = listOf(
    Icons.Outlined.AccountBox,
    Icons.Outlined.AccountCircle,
    Icons.Outlined.AddCircle,
    Icons.Outlined.Add,
    Icons.AutoMirrored.Outlined.ArrowBack,
    Icons.Outlined.ArrowDropDown,
    Icons.AutoMirrored.Outlined.ArrowForward,
    Icons.Outlined.Build,
    Icons.Outlined.Call,
    Icons.Outlined.CheckCircle,
    Icons.Outlined.Check,
    Icons.Outlined.Clear,
    Icons.Outlined.Close,
    Icons.Outlined.Create,
    Icons.Outlined.DateRange,
    Icons.Outlined.Delete,
    Icons.Outlined.Done,
    Icons.Outlined.Edit,
    Icons.Outlined.Email,
    Icons.AutoMirrored.Outlined.ExitToApp,
    Icons.Outlined.Face,
    Icons.Outlined.FavoriteBorder,
    Icons.Outlined.Favorite,
    Icons.Outlined.Home,
    Icons.Outlined.Info,
    Icons.Outlined.KeyboardArrowDown,
    Icons.AutoMirrored.Outlined.KeyboardArrowLeft,
    Icons.AutoMirrored.Outlined.KeyboardArrowRight,
    Icons.Outlined.KeyboardArrowUp,
    Icons.AutoMirrored.Outlined.List,
    Icons.Outlined.LocationOn,
    Icons.Outlined.Lock,
    Icons.Outlined.MailOutline,
    Icons.Outlined.Menu,
    Icons.Outlined.MoreVert,
    Icons.Outlined.Notifications,
    Icons.Outlined.Person,
    Icons.Outlined.Phone,
    Icons.Outlined.Place,
    Icons.Outlined.PlayArrow,
    Icons.Outlined.Refresh,
    Icons.Outlined.Search,
    Icons.AutoMirrored.Outlined.Send,
    Icons.Outlined.Settings,
    Icons.Outlined.Share,
    Icons.Outlined.ShoppingCart,
    Icons.Outlined.Star,
    Icons.Outlined.ThumbUp,
    Icons.Outlined.Warning,
)

@Preview
@Composable
private fun OutlinedGrid(paddingValues: PaddingValues = PaddingValues()) {
    LazyVerticalGrid(
        GridCells.Adaptive(60.dp),
        modifier = Modifier.padding(paddingValues = paddingValues)
    ) {
        items(list) {
            Icon(imageVector = it, contentDescription = null, modifier = Modifier.padding(8.dp))
        }
    }
}
