import java.text.SimpleDateFormat
import java.util.*

object Module {
    fun selectAppOrLib(isApp: Boolean): String {
        return if (isApp) {
            "com.android.application"
        } else {
            "com.android.library"
        }
    }

    fun selectManifest(isApp: Boolean): String {

        return if (isApp) {
            "src/main/AppManifest.xml"
        } else {
            "src/main/AndroidManifest.xml"
        }
    }
    
    const val appApplicationId = "com.nibflow.narrator"
    const val libApplicationId = "com.nibflow.lib"

    const val libIsApp = true

    val libAppOrLib = selectAppOrLib(libIsApp)


}