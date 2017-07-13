package text.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruits=new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruits);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i=1;i<16;i++){
            Fruit apple=new Fruit("Apple",R.mipmap.apple_pic);
            fruits.add(apple);
            Fruit banana=new Fruit("Banana",R.mipmap.banana_pic);
            fruits.add(banana);
            Fruit cherry=new Fruit("Cherry",R.mipmap.cherry_pic);
            fruits.add(cherry);
            Fruit grape=new Fruit("Grape",R.mipmap.grape_pic);
            fruits.add(grape);
            Fruit mango=new Fruit("Mango",R.mipmap.mango_pic);
            fruits.add(mango);
            Fruit orange=new Fruit("Orange",R.mipmap.orange_pic);
            fruits.add(orange);
            Fruit pear=new Fruit("Pear",R.mipmap.pear_pic);
            fruits.add(pear);
            Fruit pineapple=new Fruit("Pineapple",R.mipmap.pineapple_pic);
            fruits.add(pineapple);
            Fruit strawberry=new Fruit("Strawberry",R.mipmap.strawberry_pic);
            fruits.add(strawberry);
            Fruit watermelon=new Fruit("Watermelon",R.mipmap.watermelon_pic);
            fruits.add(watermelon);
        }

    }
}
