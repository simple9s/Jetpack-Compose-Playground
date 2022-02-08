object AppDependencies {

    val project = listOf(
        ":base"
    )

    val bom = listOf(
        Libraries.firebaseBom,
        Libraries.okhttpBom,
    )

    val implementation = listOf(
        Libraries.composeAnimation,
        Libraries.composeAnimationGraphics,
        Libraries.composeCompiler,
        Libraries.composeFoundation,
        Libraries.composeMaterial,
        Libraries.composeMaterialIcons,
        Libraries.composeMaterial3,
        Libraries.composeRuntime,
        Libraries.composeLiveData,
        Libraries.composeUi,
        Libraries.composeUiUtil,
        Libraries.composeUiTooling,
        Libraries.profileInstaller,
        Libraries.navigation,
        Libraries.glance,
        Libraries.composeConstraint,
        Libraries.composePaging,
        Libraries.composeActivity,
        Libraries.appCompat,
        Libraries.viewModel,
        Libraries.firebaseAnalytics,
        Libraries.firebaseCrashlytics,
        Libraries.firebaseFirestore,
        Libraries.firebaseMessaging,
        Libraries.firebaseInstallations,
        Libraries.firebaseAuth,
        Libraries.hilt,
        Libraries.hiltNavigation,
        Libraries.startUp,
        Libraries.coroutines,
        Libraries.coroutinesAndroid,
        Libraries.coroutinesPlayServices,
        Libraries.dataStore,
        Libraries.protobufJavaLite,
        Libraries.playCore,
        Libraries.playCoreKtx,
        Libraries.cameraxCore,
        Libraries.camerax2,
        Libraries.cameraxLifecycle,
        Libraries.cameraxView,
        Libraries.workManager,
        Libraries.mapsCompose,
        Libraries.playServicesMaps,
        Libraries.retrofit,
        Libraries.okhttp,
        Libraries.okhttpLogging,
        Libraries.kotlinxSerializationConverter,
        Libraries.kotlinxSerialization,
        Libraries.accompanistInsets,
        Libraries.accompanistFlow,
        Libraries.accompanistPager,
        Libraries.accompanistPagerIndicators,
        Libraries.accompanistSystemuicontroller,
        Libraries.accompanistSwipeRefresh,
        Libraries.accompanistPermissions,
        Libraries.accompanistPlaceholderMaterial,
        Libraries.accompanistDrawablePainter,
        Libraries.accompanistNavigationAnimation,
        Libraries.accompanistNavigationMaterial,
        Libraries.accompanistWebView,
        Libraries.landscapistCoil,
        Libraries.landscapistGlide,
        Libraries.landscapistFresco,
        Libraries.orchestraBalloon,
        Libraries.orchestraColorPicker,
//        Libraries.orchestraSpinner,
        Libraries.coil,
        Libraries.coilCompose,
        Libraries.glide,
        Libraries.fresco,
        Libraries.timber,
        Libraries.lottie,
        Libraries.ratingBar,
        Libraries.revealSwipe,
        Libraries.speedDial,
        Libraries.fontAwesome,
        Libraries.composeCharts,
        Libraries.composeNeumorphism,
        Libraries.composeMarkdown,
        Libraries.composeBarcodes,
        Libraries.composeRichtextUi,
        Libraries.composeRichtextUiMaterial,
        Libraries.composeRichtextPrinting,
//        Libraries.composeRichtextSlideshow,
        Libraries.stageStepBar,
        Libraries.plot,
        Libraries.composeTimelineView,
        Libraries.composeParticleSystem,
        Libraries.ssJetPackComposeProgressButton,
        Libraries.gap,
//        Libraries.permissionsUi,
        Libraries.htmlText,
        Libraries.snapper,
        Libraries.composeShimmer,
        Libraries.zoomableComposeImage,
        Libraries.composeTreeMap,
        Libraries.adMob,
        Libraries.playServicesAuth,
    )

    val kapt = listOf(
        Libraries.hiltCompiler,
        Libraries.glideCompiler,
    )

    val debug = listOf(
        Libraries.kotlinReflect
    )

    val androidTest = listOf(
        TestLibraries.composeUi,
        TestLibraries.composeUiJunit,
        TestLibraries.navigation,
        TestLibraries.testCore,
    )
}