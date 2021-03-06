
package services;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.InvoiceRepository;
import domain.Invoice;
@Service
@Transactional
public class InvoiceService {
@Autowired
	private InvoiceRepository invoiceRepository;
public Collection<Invoice>  findAll(){
return invoiceRepository.findAll();
}
public Invoice findOne(Integer valueOf) {
return invoiceRepository.findOne(valueOf);
}
public Invoice save(Invoice invoice){
return invoiceRepository.save(invoice);
}
}