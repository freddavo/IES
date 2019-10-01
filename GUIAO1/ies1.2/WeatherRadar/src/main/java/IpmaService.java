import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;



    public interface IpmaService {

        @GET("forecast/meteorology/cities/daily/{city_id}.json")
        Call<IpmaCityForecast> getForecastForACity(@Path("city_id") int cityId);

        @GET("forecast/meteorology/cities/daily/{local}.json")
        Call<IpmaCityForecast> getForecastForACityByName(@Path("local") String local);

    }

