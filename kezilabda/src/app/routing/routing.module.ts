import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { JegyvasarlasComponent } from '../jegyvasarlas/jegyvasarlas.component';
import { JatekosokKezeleseComponent } from '../jatekosok-kezelese/jatekosok-kezelese.component';
import { CsapatokKezeleseComponent } from '../csapatok-kezelese/csapatok-kezelese.component';
import { MeccsekKezeleseComponent } from '../meccsek-kezelese/meccsek-kezelese.component';
import { KezdolapComponent } from '../kezdolap/kezdolap.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/kezdolap',
    pathMatch: 'full'
  },
  {
    path: 'kezdolap',
    component: KezdolapComponent
  },
  {
    path: 'csapatok_kezelese',
    component: CsapatokKezeleseComponent
  },
  {
    path: 'jegyvasarlas',
    component: JegyvasarlasComponent
  },
  {
    path: 'jatekosok_kezelese',
    component: JatekosokKezeleseComponent
  },
  {
    path: 'meccsek_kezelese',
    component: MeccsekKezeleseComponent
  },
  {
    path: '**',
    redirectTo: '/',
  },
];

@NgModule({
  imports: [ RouterModule.forRoot(routes)  ],
  exports: [ RouterModule ],
  declarations: []
})
export class RoutingModule { }
