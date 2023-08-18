package com.steleot.jetpackcompose.playground.compose.materialiconsextended

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.steleot.jetpackcompose.playground.navigation.graph.MaterialIconsExtendedNavRoutes
import com.steleot.jetpackcompose.playground.ui.base.material.DefaultScaffold

private const val URL = "materialiconsextended/ExtendedTwoToneScreen.kt"

@Composable
fun ExtendedTwoToneScreen() {
    DefaultScaffold(
        title = MaterialIconsExtendedNavRoutes.ExtendedTwoTone,
        link = URL,
    ) {
        ExtendedTwoToneGrid()
    }
}

private val list = listOf(
    Icons.TwoTone._3dRotation,
    Icons.TwoTone._4k,
    Icons.TwoTone._5g,
    Icons.TwoTone._6FtApart,
    Icons.TwoTone._360,
    Icons.TwoTone.AccessAlarm,
    Icons.TwoTone.AccessAlarms,
    Icons.TwoTone.Accessibility,
    Icons.TwoTone.AccessibilityNew,
    Icons.TwoTone.AccessibleForward,
    Icons.TwoTone.Accessible,
    Icons.TwoTone.AccessTime,
    Icons.TwoTone.AccountBalance,
    Icons.TwoTone.AccountBalanceWallet,
    Icons.TwoTone.AccountTree,
    Icons.TwoTone.AcUnit,
    Icons.TwoTone.Adb,
    Icons.TwoTone.AddAlarm,
    Icons.TwoTone.AddAlert,
    Icons.TwoTone.AddAPhoto,
    Icons.TwoTone.AddBox,
    Icons.TwoTone.AddBusiness,
    Icons.TwoTone.Addchart,
    Icons.TwoTone.AddCircleOutline,
    Icons.TwoTone.AddComment,
    Icons.TwoTone.AddIcCall,
    Icons.TwoTone.AddLocation,
    Icons.TwoTone.AddLocationAlt,
    Icons.TwoTone.AddPhotoAlternate,
    Icons.TwoTone.AddRoad,
    Icons.TwoTone.AddShoppingCart,
    Icons.TwoTone.AddTask,
    Icons.TwoTone.AddToHomeScreen,
    Icons.TwoTone.AddToPhotos,
    Icons.TwoTone.AddToQueue,
    Icons.TwoTone.Adjust,
    Icons.TwoTone.AdminPanelSettings,
    Icons.TwoTone.AdUnits,
    Icons.TwoTone.Agriculture,
    Icons.TwoTone.AirlineSeatFlatAngled,
    Icons.TwoTone.AirlineSeatFlat,
    Icons.TwoTone.AirlineSeatIndividualSuite,
    Icons.TwoTone.AirlineSeatLegroomExtra,
    Icons.TwoTone.AirlineSeatLegroomNormal,
    Icons.TwoTone.AirlineSeatLegroomReduced,
    Icons.TwoTone.AirlineSeatReclineExtra,
    Icons.TwoTone.AirlineSeatReclineNormal,
    Icons.TwoTone.AirplanemodeActive,
    Icons.TwoTone.AirplanemodeInactive,
    Icons.TwoTone.Airplay,
    Icons.TwoTone.AirportShuttle,
    Icons.TwoTone.AlarmAdd,
    Icons.TwoTone.Alarm,
    Icons.TwoTone.AlarmOff,
    Icons.TwoTone.AlarmOn,
    Icons.TwoTone.Album,
    Icons.TwoTone.AlignHorizontalCenter,
    Icons.TwoTone.AlignHorizontalLeft,
    Icons.TwoTone.AlignHorizontalRight,
    Icons.TwoTone.AlignVerticalBottom,
    Icons.TwoTone.AlignVerticalCenter,
    Icons.TwoTone.AlignVerticalTop,
    Icons.TwoTone.AllInbox,
    Icons.TwoTone.AllInclusive,
    Icons.TwoTone.AltRoute,
    Icons.TwoTone.AmpStories,
    Icons.TwoTone.Analytics,
    Icons.TwoTone.Anchor,
    Icons.TwoTone.Android,
    Icons.TwoTone.Announcement,
    Icons.TwoTone.Apartment,
    Icons.TwoTone.Api,
    Icons.TwoTone.AppBlocking,
    Icons.TwoTone.AppSettingsAlt,
    Icons.TwoTone.Apps,
    Icons.TwoTone.Architecture,
    Icons.TwoTone.Archive,
    Icons.TwoTone.ArrowBackIos,
    Icons.TwoTone.ArrowCircleDown,
    Icons.TwoTone.ArrowCircleUp,
    Icons.TwoTone.ArrowDownward,
    Icons.TwoTone.ArrowDropDownCircle,
    Icons.TwoTone.ArrowDropUp,
    Icons.TwoTone.ArrowForwardIos,
    Icons.TwoTone.ArrowLeft,
    Icons.TwoTone.ArrowRightAlt,
    Icons.TwoTone.ArrowRight,
    Icons.TwoTone.ArrowUpward,
    Icons.TwoTone.Article,
    Icons.TwoTone.ArtTrack,
    Icons.TwoTone.AspectRatio,
    Icons.TwoTone.Assessment,
    Icons.TwoTone.AssignmentInd,
    Icons.TwoTone.Assignment,
    Icons.TwoTone.AssignmentLate,
    Icons.TwoTone.AssignmentReturned,
    Icons.TwoTone.AssignmentReturn,
    Icons.TwoTone.AssignmentTurnedIn,
    Icons.TwoTone.Assistant,
    Icons.TwoTone.AssistantPhoto,
    Icons.TwoTone.Atm,
    Icons.TwoTone.AttachEmail,
    Icons.TwoTone.AttachFile,
    Icons.TwoTone.Attachment,
    Icons.TwoTone.AttachMoney,
    Icons.TwoTone.Audiotrack,
    Icons.TwoTone.AutoDelete,
    Icons.TwoTone.Autorenew,
    Icons.TwoTone.AvTimer,
    Icons.TwoTone.BabyChangingStation,
    Icons.TwoTone.Backpack,
    Icons.TwoTone.Backspace,
    Icons.TwoTone.Backup,
    Icons.TwoTone.BackupTable,
    Icons.TwoTone.Badge,
    Icons.TwoTone.BakeryDining,
    Icons.TwoTone.Balcony,
    Icons.TwoTone.Ballot,
    Icons.TwoTone.BarChart,
    Icons.TwoTone.BatchPrediction,
    Icons.TwoTone.Bathroom,
    Icons.TwoTone.Bathtub,
    Icons.TwoTone.BatteryAlert,
    Icons.TwoTone.BatteryChargingFull,
    Icons.TwoTone.BatteryFull,
    Icons.TwoTone.BatterySaver,
    Icons.TwoTone.BatteryStd,
    Icons.TwoTone.BatteryUnknown,
    Icons.TwoTone.BeachAccess,
    Icons.TwoTone.Bed,
    Icons.TwoTone.BedroomBaby,
    Icons.TwoTone.BedroomChild,
    Icons.TwoTone.BedroomParent,
    Icons.TwoTone.Bedtime,
    Icons.TwoTone.Beenhere,
    Icons.TwoTone.Bento,
    Icons.TwoTone.BikeScooter,
    Icons.TwoTone.Biotech,
    Icons.TwoTone.Blender,
    Icons.TwoTone.Block,
    Icons.TwoTone.Bloodtype,
    Icons.TwoTone.BluetoothAudio,
    Icons.TwoTone.BluetoothConnected,
    Icons.TwoTone.BluetoothDisabled,
    Icons.TwoTone.BluetoothDrive,
    Icons.TwoTone.Bluetooth,
    Icons.TwoTone.BluetoothSearching,
    Icons.TwoTone.BlurCircular,
    Icons.TwoTone.BlurLinear,
    Icons.TwoTone.BlurOff,
    Icons.TwoTone.BlurOn,
    Icons.TwoTone.Bolt,
    Icons.TwoTone.Book,
    Icons.TwoTone.BookmarkAdded,
    Icons.TwoTone.BookmarkAdd,
    Icons.TwoTone.BookmarkBorder,
    Icons.TwoTone.Bookmark,
    Icons.TwoTone.BookmarkRemove,
    Icons.TwoTone.Bookmarks,
    Icons.TwoTone.BookOnline,
    Icons.TwoTone.BorderAll,
    Icons.TwoTone.BorderBottom,
    Icons.TwoTone.BorderClear,
    Icons.TwoTone.BorderColor,
    Icons.TwoTone.BorderHorizontal,
    Icons.TwoTone.BorderInner,
    Icons.TwoTone.BorderLeft,
    Icons.TwoTone.BorderOuter,
    Icons.TwoTone.BorderRight,
    Icons.TwoTone.BorderStyle,
    Icons.TwoTone.BorderTop,
    Icons.TwoTone.BorderVertical,
    Icons.TwoTone.BrandingWatermark,
    Icons.TwoTone.BreakfastDining,
    Icons.TwoTone.Brightness1,
    Icons.TwoTone.Brightness2,
    Icons.TwoTone.Brightness3,
    Icons.TwoTone.Brightness4,
    Icons.TwoTone.Brightness5,
    Icons.TwoTone.Brightness6,
    Icons.TwoTone.Brightness7,
    Icons.TwoTone.BrightnessAuto,
    Icons.TwoTone.BrightnessHigh,
    Icons.TwoTone.BrightnessLow,
    Icons.TwoTone.BrightnessMedium,
    Icons.TwoTone.BrokenImage,
    Icons.TwoTone.BrowserNotSupported,
    Icons.TwoTone.BrunchDining,
    Icons.TwoTone.Brush,
    Icons.TwoTone.BubbleChart,
    Icons.TwoTone.BugReport,
    Icons.TwoTone.BuildCircle,
    Icons.TwoTone.Bungalow,
    Icons.TwoTone.BurstMode,
    Icons.TwoTone.BusAlert,
    Icons.TwoTone.BusinessCenter,
    Icons.TwoTone.Business,
    Icons.TwoTone.Cabin,
    Icons.TwoTone.Cable,
    Icons.TwoTone.Cached,
    Icons.TwoTone.Cake,
    Icons.TwoTone.Calculate,
    Icons.TwoTone.CalendarToday,
    Icons.TwoTone.CalendarViewDay,
    Icons.TwoTone.CalendarViewMonth,
    Icons.TwoTone.CalendarViewWeek,
    Icons.TwoTone.CallEnd,
    Icons.TwoTone.CallMade,
    Icons.TwoTone.CallMerge,
    Icons.TwoTone.CallMissed,
    Icons.TwoTone.CallMissedOutgoing,
    Icons.TwoTone.CallReceived,
    Icons.TwoTone.CallSplit,
    Icons.TwoTone.CallToAction,
    Icons.TwoTone.CameraAlt,
    Icons.TwoTone.CameraEnhance,
    Icons.TwoTone.CameraFront,
    Icons.TwoTone.CameraIndoor,
    Icons.TwoTone.Camera,
    Icons.TwoTone.CameraOutdoor,
    Icons.TwoTone.CameraRear,
    Icons.TwoTone.CameraRoll,
)

@Preview
@Composable
private fun ExtendedTwoToneGrid() {
    LazyVerticalGrid(
        GridCells.Adaptive(60.dp)
    ) {
        items(list) {
            Icon(imageVector = it, contentDescription = null, modifier = Modifier.padding(8.dp))
        }
    }
}
