package com.esim.esimcheck


import android.content.Context
import android.os.Build
import android.telephony.euicc.EuiccManager
import android.util.Log

class ESimSupport {
    companion object {
        fun isESIMSupported(context: Context): Boolean {
            var mgr: EuiccManager? = null
            var result: Boolean = false
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                mgr = context.getSystemService(Context.EUICC_SERVICE) as EuiccManager?
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                if (mgr == null || !mgr.isEnabled) {
                    Log.d("Debug", "False")
                    result = false
                } else {
                    Log.d("Debug", "True")
                    result = true
                }
            }
            return result
        }
    }
}

