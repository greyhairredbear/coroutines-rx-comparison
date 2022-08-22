package coroutines

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.onStart

class CoroutineViewModel {
    private val reload = MutableSharedFlow<Unit>().onStart { emit(Unit) }  // TODO: make onStart return MutableSharedFlow...

    fun reload() {
//        reload.tryEmit... TODO: make compile with reload
    }
}
