import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { BookserviceService } from '../bookservice.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books:Book[]=[]

  constructor(private bookservice:BookserviceService) { }

  ngOnInit(): void {
    this.getBooks();
  }

  getBooks():void{

      this.bookservice.getBooksList().subscribe(data=>{
   this.books=data;
    console.log(this.books)
 });
  }

  updateUser():void{

  }

  deleteUser():void{

  }

  getUser():void{
    
  }

}
