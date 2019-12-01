import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { JegyvasarlasComponent } from '../jegyvasarlas/jegyvasarlas.component';
import { JatekosokKezeleseComponent } from '../jatekosok-kezelese/jatekosok-kezelese.component';
import { CsapatokKezeleseComponent } from '../csapatok-kezelese/csapatok-kezelese.component';
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
    path: 'csapat_kezelese',
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
    component: JatekosokKezeleseComponent
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
