package org.yearup.data;

import org.yearup.models.*;

public interface ShoppingCartDao {
    ShoppingCart getByUserId(int userId);

    ShoppingCart add(int userId, int productId, int quantity);

    ShoppingCart emptyCart(int userId);
    // add additional method signatures here
}