import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Book } from './book';

@Injectable({
  providedIn: 'root'
})
export class BookserviceService {

    private baseURL=environment.apiBaseURl;

  constructor(private http:HttpClient) { }

    public getBooksList():Observable<Book[]>{

    return this.http.get<Book[]>(this.baseURL+'/allbooks')
  }
}

