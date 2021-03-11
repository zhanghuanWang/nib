

object Module {
    private fun selectAppOrLib(isApp:Boolean) : String{
        return if (isApp) {
            "com.android.application"
        } else {
            "com.android.library"
        }
    }

    const val appApplicationId = "com.nibflow.narrator"
    const val libApplicationId = "com.nibflow.lib"

    const val libIsApp = true

    val libAppOrLib = selectAppOrLib(libIsApp)




}