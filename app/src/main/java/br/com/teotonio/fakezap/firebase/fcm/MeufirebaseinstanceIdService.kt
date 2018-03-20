package br.com.teotonio.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceIdService

/**
 * Created by logonrm on 19/03/2018.
 */

class MeufirebaseinstanceIdService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        super.onTokenRefresh()

    }
}