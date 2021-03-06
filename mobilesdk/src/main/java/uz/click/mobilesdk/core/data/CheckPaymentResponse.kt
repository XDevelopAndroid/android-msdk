package uz.click.mobilesdk.core.data

import com.squareup.moshi.Json

/**
 * @author rahmatkhujaevs on 29/01/19
 * */
data class CheckPaymentResponse(
    @field:Json(name = "error_code")
    val errorCode: Int,
    @field:Json(name = "error_note")
    val errorNote: String,
    @field:Json(name = "payment_id")
    var paymentId: Long?,
    @field:Json(name = "payment_status")
    var paymentStatus: Int
)