package com.example.eugene_matsyuk.dagger_arch.di.app;

import com.example.eugene_matsyuk.dagger_arch.data.network.HttpClient;
import com.example.eugene_matsyuk.dagger_arch.utils.SomeUtils;

public interface GlobalAppApi {

    HttpClient httpClient();
    SomeUtils someUtils();

}
