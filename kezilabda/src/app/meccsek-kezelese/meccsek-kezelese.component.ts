import { Component, OnInit } from '@angular/core';
import { Meccs } from '../domain/meccs';
import { MeccsService } from '../meccs.service';


@Component({
  selector: 'app-meccsek-kezelese',
  templateUrl: './meccsek-kezelese.component.html',
  styleUrls: ['./meccsek-kezelese.component.css']
})
export class MeccsekKezeleseComponent implements OnInit {

  meccs : Meccs;
  constructor(
    public meccsService: MeccsService
  ) { }

  ngOnInit() {
    this.meccsService.getMeccsek();
  }


}
