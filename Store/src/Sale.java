package Store.src;

/**
 * Author: Ati patel
 * class : IST242
 * version : 1
 * date : 02/19/2023
 */
public class Sale {
    public static double getTax (double saleTotal, StateCode state) {
        double total = 0.0;
        if (state == StateCode.PA)
        total = .06 * saleTotal;

        else if (state == StateCode.NJ)
        total = .06625 * saleTotal;

        else if (state == StateCode.GA)
        total = .04 * saleTotal;

        else if (state == StateCode.NY)
        total = .04 * saleTotal;

        return total ;
    }
    }