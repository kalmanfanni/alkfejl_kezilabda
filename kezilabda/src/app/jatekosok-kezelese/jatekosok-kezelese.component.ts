import { Component, OnInit } from '@angular/core';
import { Jatekos } from '../domain/jatekos';
import { JatekosService } from '../jatekos.service';


@Component({
  selector: 'app-jatekosok-kezelese',
  templateUrl: './jatekosok-kezelese.component.html',
  styleUrls: ['./jatekosok-kezelese.component.css']
})
export class JatekosokKezeleseComponent implements OnInit {

  jatekos : Jatekos;
  constructor(
    public jatekosService: JatekosService
  ) { }

  ngOnInit() {
    this.jatekosService.getJatekosok();
  }


}
