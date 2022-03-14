import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from '../user';
import { UserserviceService } from '../userservice.service';

@Component({
  selector: 'app-display-user',
  templateUrl: './display-user.component.html',
  styleUrls: ['./display-user.component.css']
})
export class DisplayUserComponent implements OnInit {


  id:number=0
  user:any
  constructor(private route: ActivatedRoute, private userservice:UserserviceService) { }

    ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.user = new User(0,'',0,'');
    this.userservice.getUser(this.id).subscribe( data => {
      this.user = data;
    });
  }

}
