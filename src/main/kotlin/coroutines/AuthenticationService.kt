package coroutines

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow

class AuthenticationService {
    private val loggedIn = MutableSharedFlow<Boolean>()
    val isLoggedIn: Flow<Boolean> = loggedIn
}
