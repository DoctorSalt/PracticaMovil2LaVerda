package es.studium.practicamovil2laverda;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerDespladorDeImagenes extends FragmentPagerAdapter
{
    public ViewPagerDespladorDeImagenes(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentFerrariImg();
            case 1:
                return new FragmnentMcalrenImg();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
