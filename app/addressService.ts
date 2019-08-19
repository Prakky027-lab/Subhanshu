import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

import {Address} from './Address';


const httpOptions={
    headers: new HttpHeaders({ 'Content-Type' : 'application/json'})
};

@Injectable()
export class AddressService{
    constructor(private http:HttpClient){}

    private userUrl="http://localhost:3000/Address";

    public addData(address:Address){
        console.log(address);
        let object={
    "name":address.name,
    "emailId":address.emailId,
    "MobileNo":address.MobileNo,
    "MobileNo2":address.MobileNo2,
    "address":address.address,
    "address2":address.address2,
    "city":address.city,
    "state":address.state,
    "PinCode":address.PinCode
        }
        return this.http.post(this.userUrl + "/addAddress",object);
    }

}