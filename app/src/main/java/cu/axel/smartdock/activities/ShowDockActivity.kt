package cu.axel.smartdock.activities

import android.content.Intent
import android.os.Bundle
import android.app.Activity
import cu.axel.smartdock.services.ACTION_SHOW_DOCK

class ShowDockActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sendBroadcast(
            Intent(LAUNCHER_ACTION)
                .setPackage(packageName)
                .putExtra("action", ACTION_SHOW_DOCK)
        )

        finish()
    }
}
