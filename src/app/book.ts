export class Book {

    
    isbn:number
    title:string
    author:string
    category:string
    description:string
    quantity:number
    price:number
    rating:number
    publishDate:Date
    lastUpdatedOn:Date


    constructor(     
    isbn:number,
    title:string,
    author:string,
    category:string,
    description:string,
    quantity:number,
    price:number,
    rating:number,
    publishDate:Date,
    lastUpdatedOn:Date
    ){

         
    this.isbn=isbn
     this.title=title
     this.author=author
     this.category=category
     this.description=description
     this.quantity=quantity
     this.price=price
     this.rating=rating
     this.publishDate=publishDate
     this.lastUpdatedOn=lastUpdatedOn
    }

}
