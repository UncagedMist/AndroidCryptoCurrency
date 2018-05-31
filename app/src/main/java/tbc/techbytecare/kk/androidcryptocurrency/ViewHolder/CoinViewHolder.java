package tbc.techbytecare.kk.androidcryptocurrency.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import tbc.techbytecare.kk.androidcryptocurrency.R;

public class CoinViewHolder  extends RecyclerView.ViewHolder {

    public ImageView coin_image;
    public TextView coin_symbol,coin_name,coin_price,one_hour_change,twenty_hours_change,seven_day_change;

    public CoinViewHolder(View itemView) {
        super(itemView);

        coin_image = itemView.findViewById(R.id.coin_icon);

        coin_symbol = itemView.findViewById(R.id.coin_symbol);
        coin_name = itemView.findViewById(R.id.coin_name);
        coin_price = itemView.findViewById(R.id.priceUsdTxt);
        one_hour_change = itemView.findViewById(R.id.oneHourTxt);
        twenty_hours_change = itemView.findViewById(R.id.twentyFourHourTxt);
        seven_day_change = itemView.findViewById(R.id.sevenDayTxt);
    }
}
