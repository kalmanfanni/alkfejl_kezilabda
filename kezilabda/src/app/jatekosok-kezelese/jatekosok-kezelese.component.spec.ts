import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { JatekosokKezeleseComponent } from './jatekosok-kezelese.component';

describe('JatekosokKezeleseComponent', () => {
  let component: JatekosokKezeleseComponent;
  let fixture: ComponentFixture<JatekosokKezeleseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ JatekosokKezeleseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(JatekosokKezeleseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
