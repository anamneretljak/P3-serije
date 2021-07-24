package ffos.aneretljak_20.serijeapk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


//Za zakomentiratu Filter metodu treba vratiti "implements Filterable"
public class SerijeAdapter extends RecyclerView.Adapter<SerijeAdapter.Red>  {

    private List<Serija> podaci;
    private List<Serija> noviPodaci;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public SerijeAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        noviPodaci = new ArrayList<>(podaci);
        View view = mInflater.inflate(R.layout.red, roditelj, false);
        return new Red(view);
    }


    @Override
    public void onBindViewHolder(Red red, int position) {
        Serija p = podaci.get(position);

        red.naziv.setText(p.getNaziv());
        red.ocjena.setText(p.getOcjena());
        red.epizoda.setText(p.getEpizoda());
        red.zanr.setText(p.getZanr());
        red.anotacija.setText(p.getSveAnotacije());

    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }


    // Pohranjuje i reciklira pogled kako se prolazi kroz listu
    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView naziv;
        private TextView ocjena;
        private TextView epizoda;
        private TextView zanr;
        private TextView anotacija;

        Red(View itemView) {
            super(itemView);

            naziv = itemView.findViewById(R.id.naziv);
            ocjena = itemView.findViewById(R.id.ocjena);
            epizoda = itemView.findViewById(R.id.epizoda);
            zanr = itemView.findViewById(R.id.zanr);
            anotacija = itemView.findViewById(R.id.anotacija);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


    public Serija getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Serija> itemList) {
        this.podaci = itemList;
    }


    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


};




