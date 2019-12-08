import { TestBed } from '@angular/core/testing';

import { JatekosService } from './jatekos.service';

describe('JatekosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: JatekosService = TestBed.get(JatekosService);
    expect(service).toBeTruthy();
  });
});
