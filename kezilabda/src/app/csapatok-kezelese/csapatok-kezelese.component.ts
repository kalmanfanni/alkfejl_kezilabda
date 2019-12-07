import { Component, OnInit } from '@angular/core';
import { Csapat } from '../domain/csapat';
import { CsapatService } from '../csapat.service';

@Component({
  selector: 'app-csapatok-kezelese',
  templateUrl: './csapatok-kezelese.component.html',
  styleUrls: ['./csapatok-kezelese.component.css']
})
export class CsapatokKezeleseComponent implements OnInit {

  csapat : Csapat;

  constructor(
    public csapatService: CsapatService
  ) { }

  ngOnInit() {
    this.csapatService.getCsapatok();
  }

}
