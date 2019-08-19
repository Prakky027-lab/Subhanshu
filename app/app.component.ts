import { Component} from '@angular/core';
import { Address } from './Address';
import {AddressService} from './addressService';

@Component({
    selector: 'app',
    templateUrl: 'app.component.html'
})
export class AppComponent { 
    Address:Address={
        name:'',
        emailId:'',
        MobileNo:0,
        MobileNo2:0,
        address:'',
        address2:'',
        city:'',
        state:'',
        PinCode:0
    }
    all:string;
    constructor( private addressService: AddressService){
    }


   addData():void{

       if(this.Address.MobileNo < 1000000000 || this.Address.MobileNo > 9999999999){
           alert("Mobile number should be of 10 digits only")
       }

       if(this.Address.PinCode < 100000 || this.Address.PinCode > 999999){
           alert("PinCode should be of 6 digits only")
       }
       
       this.all=this.Address.address+" "+this.Address.address2+" "+this.Address.city+" "+this.Address.state+" "+this.Address.PinCode;
       this.addressService.addData(this.Address).subscribe();
   };
}