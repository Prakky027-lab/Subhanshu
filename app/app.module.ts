import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import {FormsModule} from '@angular/forms';
import {AddressService} from './addressService';
import {HttpClientModule} from '@angular/common/http';


@NgModule({
    imports: [
        BrowserModule,FormsModule,HttpClientModule
        
    ],

    declarations: [
        AppComponent
        ],
    providers: [ AddressService ],
    bootstrap: [AppComponent]
})

export class AppModule { }