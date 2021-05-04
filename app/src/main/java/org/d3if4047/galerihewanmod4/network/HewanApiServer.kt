package org.d3if4047.galerihewanmod4.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

interface HewanApiServer {

}
private const val BASE_URL = "https://dif.indraazimi.com/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface HewanApiService {
    @GET("listhewan.json")
    suspend fun getHewan(): String
}
object HewanApi {
    val service: HewanApiService by lazy {
        retrofit.create(HewanApiService::class.java)
    }
}

