/*
 * Copyright 2019 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.riotx.features.login

import android.os.Bundle
import android.view.View
import androidx.annotation.CallSuper
import com.airbnb.mvrx.activityViewModel
import im.vector.riotx.core.platform.OnBackPressed
import im.vector.riotx.core.platform.VectorBaseFragment

/**
 * Parent Fragment for all the login/registration screens
 */
abstract class AbstractLoginFragment : VectorBaseFragment(), OnBackPressed {

    protected val viewModel: LoginViewModel by activityViewModel()
    protected lateinit var loginSharedActionViewModel: LoginSharedActionViewModel

    @CallSuper
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginSharedActionViewModel = activityViewModelProvider.get(LoginSharedActionViewModel::class.java)
    }

    override fun onBackPressed(): Boolean {
        resetViewModel()
        // Do not consume the Back event
        return false
    }

    // Reset any modification of the viewModel by the current fragment
    abstract fun resetViewModel()
}
