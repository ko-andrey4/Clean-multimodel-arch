package com.example.eugene_matsyuk.dagger_arch.di.scanner;

import com.example.core.data.db.DbClient;
import com.example.core.data.network.HttpClient;
import com.example.core.utils.SomeUtils;
import com.example.eugene_matsyuk.dagger_arch.domain.purchase.PurchaseInteractor;

public interface ScannerFeatureDependencies {

    DbClient dbClient();
    HttpClient httpClient();
    SomeUtils someUtils();
    PurchaseInteractor purchaseInteractor();

}