/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import Bid.Bid;
import Bid.service.BuyerService;
import Services.crud.BidCrud.BidCrudService;
import Services.crud.BidCrud.BidsWonCrudService;
import Services.crud.BidCrud.BuyerCrudService;
import Services.crud.BidCrud.CancelBidCrudService;
import Services.crud.BidCrud.CurrentBidCrudService;
import Services.crud.BidCrud.Impl.BidCrudServiceImpl;
import Services.crud.BidCrud.Impl.BidsWonCrudServiceImpl;
import Services.crud.BidCrud.Impl.CancelBidCrudServiceImpl;
import Services.crud.BidCrud.Impl.CurrentBidCrudServiceImpl;
import Services.crud.ItemsCrud.ElectronicsCrud.CellphonesCrudService;
import Services.crud.ItemsCrud.ElectronicsCrud.ElectronicsCrudService;
import Services.crud.ItemsCrud.ElectronicsCrud.LaptopsCrudService;
import Services.crud.ItemsCrud.ElectronicsCrud.PeripheralCrudService;
import Services.crud.ItemsCrud.ElectronicsCrud.StorageCrudService;
import Services.crud.ItemsCrud.ElectronicsCrud.TabletsCrudService;
import Services.crud.ItemsCrud.Impl.CellphonesCrudServiceImpl;
import Services.crud.ItemsCrud.Impl.ElectronicsCrudServiceImpl;
import Services.crud.ItemsCrud.Impl.LaptopsCrudServiceImpl;
import Services.crud.ItemsCrud.Impl.PeripheralCrudServiceImpl;
import Services.crud.ItemsCrud.Impl.StorageCrudServiceImpl;
import Services.crud.ItemsCrud.Impl.TabletsCrudServiceImpl;
import Services.crud.SellerCrud.Impl.SellerImplCrudServiceImpl;
import Services.crud.SellerCrud.SellerImplCrudService;
import Services.crud.UsersCrud.AccountsCrudService;
import Services.crud.UsersCrud.AdminCrudService;
import Services.crud.UsersCrud.Impl.AccountsCrudServiceImpl;
import Services.crud.UsersCrud.Impl.AdminCrudServiceImpl;
import Services.crud.UsersCrud.Impl.LogsCrudServiceImpl;
import Services.crud.UsersCrud.Impl.UsersCrudServiceImpl;
import Services.crud.UsersCrud.LogsCrudService;
import Services.crud.UsersCrud.UsersCrudService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Jean-Paul
 */

@Configuration
public class Config {
    @Bean(name = "BidCrudService")
    public  BidCrudService getBidCrudService(){
        return new BidCrudServiceImpl();
    }
    @Bean(name="BidsWonCrudService")
    public BidsWonCrudService getBidsWonCrudService(){
        return new BidsWonCrudServiceImpl();
    }
    
    @Bean(name="CancelBidCrudService")
    public CancelBidCrudService getCancelBidCrudService(){
        return new CancelBidCrudServiceImpl();
    }
    @Bean(name="CurrentBidCrudService")
    public CurrentBidCrudService getCurrentBidCrudService(){
        return new CurrentBidCrudServiceImpl();
    }
    @Bean(name="CellphonesCrudService")
    public CellphonesCrudService getCellphonesCrudService(){
        return new CellphonesCrudServiceImpl();
    }
    @Bean(name="ElectronicsCrudService")
    public ElectronicsCrudService getElectronicsCrudService(){
        return new ElectronicsCrudServiceImpl();
    }
    @Bean(name="LaptopsCrudService")
    public LaptopsCrudService getLaptopsCrudService(){
        return new LaptopsCrudServiceImpl();
    }
    @Bean(name="PeripheralCrudService")
    public PeripheralCrudService getPeripheralCrudService(){
        return new PeripheralCrudServiceImpl();
    }
    @Bean(name="StorageCrudService")
    public StorageCrudService getStorageCrudService(){
        return new StorageCrudServiceImpl();
    }
    @Bean(name="TabletsCrudService")
    public TabletsCrudService getTabletsCrudService(){
        return new TabletsCrudServiceImpl();
    }
    @Bean(name="SellerImplCrudService")
    public SellerImplCrudService getSellerImplCrudService(){
        return new SellerImplCrudServiceImpl();
    }
    @Bean(name="AccountsCrudService")
    public AccountsCrudService getAccountsCrudService(){
        return new AccountsCrudServiceImpl();
    }
    @Bean(name="AdminCrudService")
    public AdminCrudService getAdminCrudService(){
        return new AdminCrudServiceImpl();
    }
    @Bean(name="LogsCrudService")
    public LogsCrudService getLogsCrudService(){
        return new LogsCrudServiceImpl();
    }
    @Bean(name="UsersCrudService")
    public UsersCrudService getUsersCrudService(){
        return new UsersCrudServiceImpl();
    }
}
