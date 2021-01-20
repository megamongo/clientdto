import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
open class Bitcoin(val hash160: String?, val address:String?, val n_tx: String?, val total_received: String?, val total_sent: String?, val final_balance: String?, val txs:Array<String>?) 
{
    
    fun toJSON() = Json.encodeToString(this)

    companion object {
	@Throws(Exception::class)
        fun parseJSON(json: String) = Json.decodeFromString<Bitcoin>(json)
    }
}
